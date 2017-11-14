node {	
	def MVN_HOME = tool 'maven-3.5.0';
	echo "MVN_HOME = ${MVN_HOME}"
	stage('cleaning'){
	    cleanWs();
	}
	//clean verify -Dmvn.checkstyle.fail=false -Dmvn.findbugs.fail=false -Dmvn.pmd.fail=false
	stage('Cheking out (GIT)') {
		checkout scm
		//sh 'git clone https://github.com/osp-huhula/huhula.git ./'
	}
	stage('maven compile') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' clean compile -Dmvn.project.location=${WORKSPACE}  "
		} else {
			bat(/"${mvnHome}\bin\mvn" clean compile -Dmvn.project.location=${WORKSPACE} /)
		}
	}
	stage('maven verify') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' verify -Dmvn.project.location=${WORKSPACE} -Dmvn.checkstyle.fail=false -Dmvn.findbugs.fail=false -Dmvn.pmd.fail=false "
		} else {
			bat(/"${mvnHome}\bin\mvn" verify -Dmvn.project.location=${WORKSPACE} -Dmvn.checkstyle.fail=false -Dmvn.findbugs.fail=false -Dmvn.pmd.fail=false /)
		}
	}
	stage('maven install') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' install -Dmvn.project.location=${WORKSPACE} -Dmvn.checkstyle.fail=false -Dmvn.findbugs.fail=false -Dmvn.pmd.fail=false "
		} else {
			bat(/"${mvnHome}\bin\mvn" install -Dmvn.project.location=${WORKSPACE} -Dmvn.checkstyle.fail=false -Dmvn.findbugs.fail=false -Dmvn.pmd.fail=false /)
		}
	}
	stage('site') {
		if (isUnix()) {
			sh "'${MVN_HOME}/bin/mvn' site -Dmvn.project.location=${WORKSPACE} -DskipTests -Dmvn.checkstyle.fail=false -Dmvn.findbugs.fail=false -Dmvn.pmd.fail=false "
		} else {
			bat(/"${mvnHome}\bin\mvn" site -Dmvn.project.location=${WORKSPACE} -DskipTests -Dmvn.checkstyle.fail=false -Dmvn.findbugs.fail=false -Dmvn.pmd.fail=false /)
		}
   }
	stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}

