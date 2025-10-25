pipeline
{
    agent {
        label 'DevServer'
    }

    tools {
        maven 'myMaven'
        git 'Default'
    }

    stages{
        stage("build"){
            steps {
                sh "mvn clean package"
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: '**/*.war'
        }
    }

}