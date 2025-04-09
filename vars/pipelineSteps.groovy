def call(String projectName) {
    node {
        stage('Checkout') {
            checkout scm
        }

        stage('Build') {
            echo "Building project: ${projectName}"
            sh 'make build'
        }

        stage('Test') {
            echo "Running tests for ${projectName}"
            sh 'make test'
        }

        stage('Deploy') {
            echo "Deploying ${projectName}"
            sh "make deploy"
        }
    }
}
