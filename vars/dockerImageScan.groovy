def call(String project, String ImageTag, String hubUser){

sh"""

 trivy image ${hubUser}/${project}:${ImageTag} > imageScan.txt || true
 cat imageScan.txt

"""
}
