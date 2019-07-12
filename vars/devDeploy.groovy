def call (def source, def dest, def devid){
	sh " scp ${source} ${devid}:${dest}"

}