def call(String project, String ImageTag, String hubUser){

sh"""

trivy image --skip-db-update ${hubUser}/${project}:${ImageTag} > imageScan.txt
cat imageScan.txt

"""
}
