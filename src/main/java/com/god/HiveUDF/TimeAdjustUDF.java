package com.god.HiveUDF;
import org.apache.hadoop.hive.ql.exec.UDF;

public class TimeAdjustUDF extends UDF  {
	public Long evaluate(Long t, Integer base) {
		return t-(t%base);		
	}
}
