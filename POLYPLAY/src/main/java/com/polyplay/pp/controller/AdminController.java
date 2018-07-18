package com.polyplay.pp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.polyplay.pp.util.MediaUtils;
import com.polyplay.pp.domain.ContentsVo;
import com.polyplay.pp.service.AdminService;
import com.polyplay.pp.util.UploadFileUtils;

@Controller
public class AdminController {

	@Resource(name="uploadPath")
	private String uploadPath;
	
	@Autowired
	private AdminService as;
	
	
	@RequestMapping(value="/AdminMember", method=RequestMethod.GET)
	public String adminMemberController() {
		
//		selectAdMember
		
		return "";
	}
	
	@RequestMapping(value="/AdminMemberUpdateAuth", method=RequestMethod.POST)
	public String adminMemberUpdateAuthController() {
		
		//	updateAuthMember
		
		return "";
	}
	
	@RequestMapping(value="/AdminContents", method=RequestMethod.GET)
	public String adminContentsController() {
		
		//	selectAdContents
		
		return "views/admin/adminBoard";
	}
	
	@RequestMapping(value="/AdminContentsWrite", method=RequestMethod.GET)
	public String adminContentsWriteController() {
		
		
		
		
		return "views/admin/adminContentsWrite";
	}
	
	@RequestMapping(value = "/uploadAjax",method=RequestMethod.POST,produces = "application/text; charset=utf8")
	public @ResponseBody ResponseEntity<String> uploadAjax(HttpServletRequest request,MultipartFile file) throws Exception{
 		ResponseEntity<String> entity = null;
 		
 		//System.out.println("����1"+file.getContentType());
 		//System.out.println("����3"+file.getSize());
 		//System.out.println("����2"+file.getContentType());
 		
 		
 		entity = new ResponseEntity<String>(UploadFileUtils.uploadFile(uploadPath, file.getOriginalFilename(), 
				file.getBytes()),HttpStatus.CREATED);
 
 		return entity;
 				
 	}
 	
 	//ResponseEntity : �����Ϳ� ����� ������ , ResponseBody : ���ϰ��� ��ü�� �޾��ַ���
	@RequestMapping(value = "/displayFile",method=RequestMethod.GET)
	public @ResponseBody ResponseEntity<byte[]> displayFile(String fileName)throws Exception{
		
		InputStream in = null;
		//�������̳� �̹��� ������ ���� Ŭ����
		ResponseEntity<byte[]> entity = null;
		
		try{
			String formatName = fileName.substring(fileName.lastIndexOf(".")+1);
			//formatName ���� Ȯ���� �̾Ƴ��� Ŭ����
			MediaType mType = MediaUtils.getMediaType(formatName);
			
			HttpHeaders headers = new HttpHeaders();
			
			in = new FileInputStream(uploadPath+fileName);
			//���ε� ��ο� �����̸��� ���ϰ�
			//mine type
			if(mType != null){
				headers.setContentType(mType);
		}else{
			
			fileName = fileName.substring(fileName.indexOf("_")+1);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			headers.add("Content-Disposition", "attachment; filename=\""+
					new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
		}
			
			entity = new ResponseEntity<byte[]>(IOUtils.toByteArray(in),
					headers,
					HttpStatus.CREATED);
		}catch(Exception e){
			e.printStackTrace();
			entity = new ResponseEntity<byte[]>(HttpStatus.BAD_REQUEST);
		}finally{
			in.close();
		}
			return entity;
	}
	
	@RequestMapping(value = "/deleteFile",method=RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> deleteFile(String fileName){
		ResponseEntity<String> entity = null;
		String formatName = fileName.substring(fileName.lastIndexOf(".")+1);
		
		MediaType mType = MediaUtils.getMediaType(formatName);
		
		if(mType != null){
			
			String front = fileName.substring(0, 12);
			String end = fileName.substring(14);
			new File(uploadPath + (front+end).replace('/', File.separatorChar)).delete(); 
		}
		
		new File(uploadPath + fileName.replace('/', File.separatorChar)).delete();
		
		entity = new ResponseEntity<String>("deleted", HttpStatus.OK);
		
		return entity;
	}
	
	@RequestMapping(value="/AdminContentsWriteAction", method=RequestMethod.POST)
	public String adminContentsWriteActionController(@ModelAttribute("cv") ContentsVo cv,Model model) {
		//	 insertContents
		String page = null;
		System.out.println("cv�ȿ� ������ �ֳ���? "+cv);
		System.out.println("gidx: "+cv.getGidx());
		System.out.println("�̹��� : "+cv.getcImage());
		System.out.println("��� : "+cv.getcVideo());
		System.out.println("������� : "+cv.getcPreVideo());
		int cc = as.insertContents(cv);

		System.out.println("���ɴϴ�4"+cc);
		if (cc == 1) {
			page = "redirect:/AdminContents";
		} else {

			page = "redirect:/AdminContentsWrite";
		}
		return page;
	}
	
	@RequestMapping(value="/AdminContentsModify", method=RequestMethod.GET)
	public String adminContentsModifyController() {

		return "";
	}
	
	@RequestMapping(value="/AdminContentsModifyAction", method=RequestMethod.POST)
	public String adminContentsModifyActionController() {
		
		//	updateContents

		return "";
	}
	
	@RequestMapping(value="/AdminContentsDelete", method=RequestMethod.GET)
	public String adminContentsDeleteController() {
		
		return "";
	}
	
	@RequestMapping(value="/AdminContentsDeleteAction", method=RequestMethod.POST)
	public String adminContentsDeleteActionController() {
		
		//	 deleteContents
		
		return "";
	}
	
	@RequestMapping(value="/AdminOrderPay", method=RequestMethod.GET)
	public String adminOrderPayController() {
		
		//	 selectAdOrder
		
		return "";
	}
	
	@RequestMapping(value="/AdminOrderPayDelete", method=RequestMethod.POST)
	public String adminOrderPayDeleteController() {
		
		//	deleteAdOrder
		
		return "";
	}
	
	@RequestMapping(value="/AdminUpdatePay", method=RequestMethod.GET)
	public String adminUpdatePayController() {
		
		//	 updateAdPay
		
		return "";
	}
	

	

	
	@RequestMapping(value="/AdminReview", method=RequestMethod.GET)
	public String adminReviewController() {
		
		//	 selectAdReview 
		
		return "";
	}
	
	@RequestMapping(value="/AdminReviewDelete", method=RequestMethod.POST)
	public String adminReviewDeleteController() {
		
		//	 deleteAdReview  
		
		return "";
	}
	
	@RequestMapping(value="/AdminBoard")
	   public String adminBoardController() {
	      
	      //
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardList")
	   public String adminBoardListController() {
	      
	      //selectAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardContent")
	   public String adminBoardContentController() {
	      
	      //selectAdBoardContent
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardDelete")
	   public String adminBoardDeleteController() {
	      
	      //deleteAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardWrite")
	   public String adminBoardWriteController() {
	      
	      //
		
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardWriteAction")
	   public String adminBoardWriteActionController() {
	      
	      //insertAdBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardReplyWrite")
	   public String adminBoardReplyWriteController() {
	      
		 //selectAdBoardContent
	      
	      return "";
	   }

	@RequestMapping(value="/AdminBoardReplyWriteAction")
	   public String adminBoardReplyWriteActionController() {
	      
	
		 //Ʈ����� adReplyBoard
	      
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardModify")
	   public String adminBoardModifyController() {
	      
		//selectAdBoardContent
		
	      return "";
	   }
	
	@RequestMapping(value="/AdminBoardModifyAction")
	   public String adminBoardModifyActionController() {
	      
		//updateAdBoard
		
	      return "";
	   }
}