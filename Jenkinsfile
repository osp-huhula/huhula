node {
	def MVN_HOME = tool 'maven-3.5.0';
	stage('Cheking out (GIT)') {
		checkout scm
	}
	stage('maven package') {
		echo "PATH = ${PATH}"
		echo "M2_HOME = ${M2_HOME}"
		echo "MVN_HOME = ${MVN_HOME}"
		sh '${MVN_HOME}/bin/mvn clean verify'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			sh "mvn clean package"
		}
	}
}
