pipeline {
    agent any

    environment {
        MAVEN_HOME = tool 'M3'  // Ensure Maven is installed on Jenkins and named 'M3'
        JAVA_HOME = tool 'JDK11' // Ensure JDK 11 or the appropriate version is installed
    }

    stages {
        stage('Checkout') {
            steps {
                // Pull code from GitHub
                git 'https://github.com/mathesh3/spring-boot-demo.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Run Maven to clean and package the project
                    sh "${MAVEN_HOME}/bin/mvn clean package"
                }
            }
        }

        stage('Archive JAR') {
            steps {
                // Archive the generated JAR file (assumes it's in target/)
                archiveArtifacts artifacts: 'target/*.jar', allowEmptyArchive: true
            }
        }
    }

    post {
        always {
            // Clean up workspace after the job is done
            cleanWs()
        }
    }
}
