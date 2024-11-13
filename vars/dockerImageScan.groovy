def call(String project, String ImageTag, String hubUser){

sh"""

trivy image --light ${hubUser}/${project}:${ImageTag} > imageScan.txt
cat imageScan.txt

"""
}
