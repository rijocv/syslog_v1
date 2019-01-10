pipeline {
    agent any

    tools {
      maven 'Maven 3.3.9'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -Dmaven.test.failure.ignore=true clean compile'
            }
            }

        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn -Dmaven.test.failure.ignore=true test'
            }
        }
        stage('Package') {
            steps {
                echo 'Packaging....'
                sh 'mvn -DskipTests package'
                archiveArtifacts artifacts: '**/target/*sys*.jar', fingerprint: true
            }
        }
    }
}
