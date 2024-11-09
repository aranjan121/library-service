pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
			 echo 'Building the aplication...'
			 bat 'mvn clean install'
               
            }
			
        }
		stage('Deploy to Tomcate server') {
            steps {
                echo 'Deploy to Tomcate server.....'
				deploy adapters: [tomcat10(credentialsId: 'TEST_USER_CRE', path: '', url: 'http://localhost:8080')], contextPath: null, war: '**/*.war'
            }
        }
    }
	
}