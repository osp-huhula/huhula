node {
   stage('Cheking out (GIT)') {
     checkout scm
   }
   stage('maven package') {
     def mvn_version = 'M3'
     withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
       sh "mvn clean package"
     }
   }
}
