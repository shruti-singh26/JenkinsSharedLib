def call(def DockerRepo, def ImageName ,def BUILD_NUMBER, def KubePath, def appFile){
//	sh"  sed 's/^\(\s*image\s*:\s*\).*/\1${DockerRepo}:${ImageName}-${BUILD_NUMBER}/' ${KubePath}/${appFile}"
//	${DockerRepo}:${ImageName}-${BUILD_NUMBER}
//	sed 's/^\(\s*image\s*:\s*\).*/\1tomcat:8/' app-deployment.yaml
//	sed 's/301:petclinic-**/301:petclinic-${BUILD_NUMBER}' 
	sh "sed 's/^\(\s*image\s*:\s*\).*/\1${DockerRepo}:${ImageName}-${BUILD_NUMBER}/' ${KubePath}/${appFile}"
}