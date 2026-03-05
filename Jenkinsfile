pipeline {
    agent any

    tools {
        // Имя 'M3' должно совпадать с тем, что вы указали в Global Tool Configuration
        maven 'MAVEN_MY_PC'
    }

    stages {
        stage('Checkout') {
            steps {
                // Получение кода из Git
                git url: 'https://github.com/github4ta/demo-jenkins.git', branch: 'master'
            }
        }

        stage('Test') {
            steps {
                // Запуск тестов. На Windows используйте bat, на Linux — sh
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // JUnit плагин в Jenkins понимает XML-отчеты от JUnit 5 без проблем
            junit testResults: '**/target/surefire-reports/TEST-*.xml', allowEmptyResults: true
        }
    }
}
