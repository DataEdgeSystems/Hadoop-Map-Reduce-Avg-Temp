# AvgTemp
Project To calculate the average of Temperatures from a dataset using MapReduce in Hadoop

## Steps to Run :

1.	Clone the repository.

    1.1. Install openjdk7 or newer version (See instructions here : http://openjdk.java.net/install/).
   
    1.2. Make sure you have Hadoop Installed (See instructions here :          https://hadoop.apache.org/docs/current/hadoop-project-dist/hadoop-common/SingleCluster.html).
   
    1.3. Install a Integrated Development Environment (IDE) of your choice. I prefer Eclipse. (See instructions here : http://ubuntuhandbook.org/index.php/2014/06/install-latest-eclipse-ubuntu-14-04/).
   
   1.4. Get the dataset from http://www.ncdc.noaa.gov/orders/qclcd/ : For any specific year or whole.


     Once you have everything in place:

2.	use ##start-all.sh (Deprecated : use start-dfs.sh and start-yarn.sh for starting namenodes, datanodes, resource managers)
  
     Type in ##jps in terminal : (You get something like this)
    ![JPS Image](https://github.com/t2013anurag/AvgTemp/blob/master/images/1.png)
      4181 DataNode

      5214 NameNode

      5753 org.eclipse.equinox.launcher_1.3.0.v20140415-2008.jar

      4643 NodeManager

      4357 SecondaryNameNode

      4514 ResourceManager

      14302 Jps


3.	Shoot up a new cluster either in local machine or virtual machine.
     I have used here my local machine installed with Ubuntu 14.04LTE
     Go to terminal :
     type in : 
         ##hadoop fs -mkdir -p hdfs://localhost:9000//data/big/weather (To create a directory in your HDFS)
 
4.	Now copy data to your cluser:
     For example you have a dataset residing in ##/home/anurag/data/small/
     type in : 
         ##hadoop fs -put /home/anurag//data/big/weather hdfs://localhost:9000//data/big/weather
 
5.	Go to : http://localhost:50070/explorer.html to see whether files were copied or not.	![HDFS Explorer](https://github.com/t2013anurag/AvgTemp/blob/master/images/2.png)
      Now I have already exported the jar for using with our dataset, you can export your own from IDE
      Copy the jar to your filesystem. Mine resides in /home/anurag/workspace2/AvgTemp/bin/AvgTemp.jar
       

6.	So to run the Job on your cluster :
      type in :
       ##hadoop jar /home/anurag/workspace2/AvgTemp/bin/AvgTemp.jar AvgTemp hdfs://localhost:9000/data/big/weather                hdfs://localhost:9000/data/big/weather/output.
      	![Output Success](https://github.com/t2013anurag/AvgTemp/blob/master/images/3.png)

And voila!!
You just ran your Map Reduce Job successfully.

#For any queries :
#tiwari.anurag126@gmail.com
 

