node {
	def MVN_HOME = tool 'maven-3.5.0';
	echo "MVN_HOME = ${MVN_HOME}"
	stage('Cheking out (GIT)') {
		checkout scm
	}
	stage('maven package') {
		sh '${MVN_HOME}/bin/mvn clean verify'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			sh "mvn clean package"
		}
	}
}
