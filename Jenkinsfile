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

    environment{
        FIRSTNAME = "Prite"
    }

    parameters {
        string defaultValue: 'Dey', name: 'LASTNAME'
    }


    stages{
        stage("build"){
            steps {
                sh "mvn clean package"
                echo "Hello $FIRSTNAME ${params.LASTNAME}"
            }
        }

        post {
            success {
                archiveArtifacts artifacts: '**/*.war'
            }
        }
    }

    

}