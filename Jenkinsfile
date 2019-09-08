node {
   
   stage('Code Checkout') { 
     git credentialsId: 'githubID', url: 'https://github.com/devopsprojects-2019/Citimagic.git' 
    }
   stage('Build') {
    withMaven(jdk: 'JDK-1.8', gradle: 'gradle') {
     sh 'gradle clean compile'
      }
    }
   stage('Unit Test run') {
    withMaven(jdk: 'JDK-1.8', gradle: 'gradle'') {
     sh 'gradle test'
      } 
    }
  
   
   stage('Deploy to Dev') {
     
    }
   stage('Automation Testing') {
     
    }
   stage('Deploy to Test') {
     
    }
   stage('Smoke Testing') {
     
    }
   stage('Deploy to Prod') {
     
    }
   stage('Acceptance Testing') {
     
    }
}
