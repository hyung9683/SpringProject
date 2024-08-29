package org.Trip.struct;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Struct;

import java.util.Map;

import org.Trip.domain.ImageFileVO;
import org.Trip.domain.TravelVO;

//%ROWTYPE을 쓴 Procedure를 쓰기 위한 클래스

public class ProcedureStruct {
	
	public static Struct createTripTvStruct(Connection conn, TravelVO tv) throws SQLException {
		
		Object[] attrtibutes = {
				
				tv.getTno(),
				tv.getTitle(),
				tv.getAddress(),
				tv.getContent(),
				tv.getLocalId(),
				tv.getLocal(),
				tv.getLocalCategory(),
				tv.getPrice()
				
		};
		
		return conn.createStruct("TRIP_TV_OBJ", attrtibutes);
		
	}
	
	public static Struct createTripImgStruct(Connection conn, ImageFileVO img) throws SQLException {
		
		Object[] attributes = {
				
				img.getIno(),
				img.getMain(),
				img.getSub1(),
				img.getSub2(),
				img.getSub3(),
				img.getSub4(),
				img.getTno(),
				img.getLocalId()
		};
		
		return conn.createStruct("TRIP_IMG_OBJ", attributes);
		
	}

}
