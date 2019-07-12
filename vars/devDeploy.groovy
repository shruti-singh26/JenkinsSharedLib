def call (def source, def dest, def devid){
echo "$devid"
	sh "scp ${source} ${devid}:${dest}"

}