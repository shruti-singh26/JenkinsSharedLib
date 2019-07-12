def call(def ImageName, def DockerRepo ,def BUILD_NUMBER){

	sh " docker build -t ${ImageName} -f Dockerfile ."
	sh " docker tag ${ImageName}:latest ${DockerRepo}:${ImageName}-${BUILD_NUMBER}"
	sh " docker push ${DockerRepo}:${ImageName}-${BUILD_NUMBER}"    

}