node {
	tools{
		maven 'maven-3.5.0'
		jdk 'JDK9'
	}
	stage('Cheking out (GIT)') {
		checkout scm
	}
	stage('maven package') {
		echo "PATH = ${PATH}"
		echo "M2_HOME = ${M2_HOME}"
		sh 'mvn clean verify'
		withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
			sh "mvn clean package"
		}
	}
}
