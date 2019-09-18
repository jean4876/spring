package kr.or.ddit.util;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import kr.or.ddit.util.model.FileInfo;

public class FileUtil {

	public static FileInfo getFileInfo(String originalFilename) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
		String yyyyMM = sdf.format(new Date());
		String yyyy = yyyyMM.substring(0,4);
		String mm = yyyyMM.substring(4,6);

		
		String path = "e:\\" + yyyy + "\\" + mm;
		File pathFile = new File(path);
		if(!pathFile.exists()) {
			pathFile.mkdirs();
		}
		
		String uuidFileName = UUID.randomUUID().toString();
		String extName = getExtension(originalFilename);
		File file = new File(path + "\\" + uuidFileName + extName);
		FileInfo fileInfo = new FileInfo();
		fileInfo.setFile(file);
		fileInfo.setName(extName);
		fileInfo.setOriginalFileName(originalFilename);
		
		
		return fileInfo;
	}

	private static String getExtension(String originalFilename) {
		//확장자가 없을 경우 공백 리턴
		//파일명에 .이 여러개 등장할 경우 가장 마지막에 있는 녀식이 확장자 구분자로 판단
		
		if(!(originalFilename.contains("."))) {
			return "";
		}else {
			String extName =  originalFilename.substring(originalFilename.lastIndexOf("."), originalFilename.length());
			return extName;
		}
		

	}

}
