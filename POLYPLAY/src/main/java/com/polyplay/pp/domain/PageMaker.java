package com.polyplay.pp.domain;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker { //����Ʈ �ϴܿ� ����¡ǥ���� ���� Ŭ����
	
	
	private int totalCount; //�� �Խù� ����
	private int startPage; 
	private int endPage;
	private boolean prev;
	private boolean next;
	private int displayPageNum = 10; //�ϴܿ� �������� ��������
//	private Criteria cri; //������ٴϴ¾�
	private SearchCriteria scri; //�˻��Ҷ� ���¾ַ� ����
	
	
	public SearchCriteria getScri() {
		return scri;
	}
	public void setScri(SearchCriteria scri) {
		this.scri = scri;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
		calcData();
	}
	
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	//�� getPrev�� �ƴ϶� is? �Ҹ�Ÿ���� ���� �ƴ϶� true false�� ��Ÿ���ϱ� �̹� �������ִ°��� �����°Ŷ�
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	public int getDisplayPageNum() {
		return displayPageNum;
	}
	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}
	

	
	//�޼ҵ带 ���� 4���� ���� 
	private void calcData() {
		
		//������� �Խù��� 100����  7���������� �ִ°��� ���ϴ°�		 //Math.ceil:�ø�/ �ݿø� round
		endPage = (int) (Math.ceil(scri.getPage()/
				(double)displayPageNum) * displayPageNum);
		
		// Math Ŭ���� �ȿ� �޼ҵ尡 public static final �� �ö���־ �޸� Ŭ���� ������ �������Ƿ� ��ü�������ϰ� �ٷ� ��밡���Ѱ� Math.�޼ҵ�
		// Math ma = new Math(); ��ü�����Ѵٸ� ma.�޼ҵ� �̷��� ȣ��....
		
		
		
		System.out.println("endPage: "+endPage);
		
		
		startPage = (endPage - displayPageNum)+1;
		
		System.out.println("startPage: "+startPage);
	
		
		int tempEndPage = (int) (Math.ceil(totalCount)/(double) scri.getPerPageNum());
		
		//������������
		if(endPage>tempEndPage) {
			endPage = tempEndPage+1;
		}	
		
		prev = startPage == 1 ? false : true;		
		// �ڹ��� ���׿����.. prev�� stratPage�� 1�̸� false, 1�� �ƴϸ� true ����
		
		next = endPage * scri.getPerPageNum() >= totalCount ? false : true;
	}	
	
	
	//UriComponentsBuilder������� page�Ķ���� �ѱ������ �޼ҵ� �߰�
	public String makeQuery(int page) {
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
//				.queryParam("perPageNum", cri.getPerPageNum()) �ٲ��ʿ���...
				.build();
		
		return uriComponents.toUriString();
		
	}

	
	
	//������,��ġŸ��,Ű���带 ������ �ٴϱ� ���� �޼ҵ� �߰�
	public String makeSearch(int page) {
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				//.queryParam("searchType", ((SearchCriteria) scri).getSearchType())
				.queryParam("searchType", scri.getSearchType())
				//  ((SearchCriteria) scri).getSearchType() �� �̷��� ������ �𸣰Ծ�...
				//å������ �׳�cri�� ����ȯ�ؼ� ���ž�  �θ�Ÿ���� �ڽ�Ÿ������ �ٿ�ĳ�����Ѱ��� Ű������ ������ ��ġ�ȿ� ���������ϱ� �����Ѱ�
				
				//.queryParam("keyword", ((SearchCriteria) scri).getKeyword())
				.queryParam("keyword", scri.getKeyword())
				.build();
		
		return uriComponents.toUriString();
		
	}
	
	
	//Ű���� ���� ���ڵ� �޼ҵ� �߰�
	private String encoding(String keyword) {
		
		if(keyword==null||keyword.trim().length()==0) {
			//Ű���尡 ���̰ų� Ʈ��(��������)�ϰ� ���̰� 0�ΰ��� ������ �������ְڴ�
			return "";
		}
		try {
			return URLEncoder.encode(keyword, "UTF-8");
			//URLEncoder�ȿ� �ִ� encode�� ����ؼ� Ű���带 UTF-8�� �����ڴ�
		}catch(UnsupportedEncodingException e) {
			return "";
		}
	}

}
