#!/bin/bash 
echo "Starting VM." 
vagrant up 
echo "VM is up." 
vagrant ssh -c 'sudo sh /vagrant/data.sh; /bin/bash'--wait-exit 

echo "Test" 
cd 
cd .\finalProject_last
mvn test