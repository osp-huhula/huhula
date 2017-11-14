node {	
	def MVN_HOME = tool 'maven-3.5.0';
	echo "MVN_HOME = ${MVN_HOME}"
	stage('cleaning'){
	    cleanWs();
	}
	stage('Cheking out (GIT)') {
		//checkout scm
		sh 'git clone https://github.com/osp-huhula/huhula.git ./'
	}
	stage('maven compile') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' -Dmvn.project.location=${WORKSPACE} clean compile"
		} else {
			bat(/"${mvnHome}\bin\mvn" -Dmvn.project.location=${WORKSPACE} clean compile/)
		}
	}
	stage('maven verify') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' -Dmvn.project.location=${WORKSPACE} -Dcheckstyle.failOnViolation=false -Dfindbugs.failOnError=false verify"
		} else {
			bat(/"${mvnHome}\bin\mvn" -Dmvn.project.location=${WORKSPACE} -Dcheckstyle.failOnViolation=false -Dfindbugs.failOnError=false verify/)
		}
	}
	stage('maven install') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' -Dmvn.project.location=${WORKSPACE} -Dcheckstyle.failOnViolation=false -Dfindbugs.failOnError=false install"
		} else {
			bat(/"${mvnHome}\bin\mvn" -Dmvn.project.location=${WORKSPACE} -Dcheckstyle.failOnViolation=false -Dfindbugs.failOnError=false install/)
		}
	}
	stage('site') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' -Dmvn.project.location=${WORKSPACE} -DskipTests -Dcheckstyle.failOnViolation=false -Dfindbugs.failOnError=false site"
		} else {
			bat(/"${mvnHome}\bin\mvn" -Dmvn.project.location=${WORKSPACE} -DskipTests -Dcheckstyle.failOnViolation=false -Dfindbugs.failOnError=false site/)
		}
   }
	stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}

