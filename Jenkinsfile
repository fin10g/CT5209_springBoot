pipeline{
    agent any

    stages {
        stage('GetProject') {
            steps {
                git 'https://github.com/fin10g/CT5209_springBoot.git'
            }
        }
        stage('build') {
            steps {
                sh 'mvn clean:clean'
                sh 'mvn dependency:copy-dependencies'
                sh 'mvn compiler:compile'
            }
        }
        stage ('Exec') {
            steps {
                sh 'mvn exec:java'
            }
        }
    }
}