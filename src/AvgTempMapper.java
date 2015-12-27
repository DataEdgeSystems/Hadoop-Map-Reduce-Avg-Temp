import java.io.*;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.mapreduce.Mapper;

public class AvgTempMapper
		extends Mapper<Object, Text, Text, IntWritable> {
		
	public void map(Object key, Text value, Context 
			context)throws IOException, InterruptedException{
		
		String[] line = value.toString().split(",");
		String datePart = line[1];
		String temp  = line[10];
		if(StringUtils.isNumeric(temp))
			context.write(new Text(datePart), new IntWritable(Integer.parseInt(temp)));
	}

}
