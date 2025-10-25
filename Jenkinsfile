pipeline
{
    agent {
        label 'DevServer'
    }

    tools {
        maven 'myMaven'
        git 'Default'
        jdk 'openJDK'
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