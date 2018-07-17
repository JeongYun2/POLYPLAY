package com.polyplay.pp.domain;

public class Criteria { //������ ����ϱ����� �ʿ��Ѹ�ŭ �̾Ƴ��� ���� Ŭ���� 
	
	private int page; //�Խù� Ȯ�ο� ������. ���� ������. �������� �̵��� ������
	private int perPageNum; //�� �������� �Խù��� ������ٰ��ΰ�? 
	

	//�����ڸ� ���� page�� perPageNum ����
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}


	public int getPage() {
		return page;
	}

	//1�̸� 1�������� ����
	public void setPage(int page) {
		if(page <=1){
			this.page = 1;
			return;
		}
		this.page = page;
	}

	//�� �������� �������� ������ ����
	public int getPerPageNum() {
		return perPageNum;
	}

	//Ư�̻��� PerPageNum�� 0�̳� 100���� ������� 10���� ó���ϰڴ�
	public void setPerPageNum(int perPageNum) {
		if(perPageNum <=0 || perPageNum > 100){ 		
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	
	//�������� �Խù� ���۹�ȣ
	public int  getPageStart(){
		return(this.page-1)*perPageNum+1;
	}
	//������� 2�������� ��������� (2-1)*15+1 ->16������ ����
	
	

	//�������� �Խù� ����ȣ
	public int  getPageEnd(){
		return (this.page-1)*perPageNum + perPageNum;
	}
	//������� 2�������� ��������� (2-1)*15+15 ->30������ ���
	
	
	
	
	//ObjectŬ������ �ִ� String�� �޼ҵ带 �������̵��Ѱ�. �������� �������ؼ� ������
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}




}
