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

        stage('test'){
            parallel{
                stage('testA'){
                    steps{
                        echo "This is test A"
                    }
                }
                stage("testB"){
                    steps{
                        echo "This is test B"
                    }
                }
            }

            post {
                success {
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
    }
}