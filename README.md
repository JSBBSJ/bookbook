# 도서판매 쇼핑몰 프로젝트 bookbook


---

온라인스토어 구매 판매 기능 및 챗봇 구현프로젝트입니다. 
Spring Boot를 활용하여 "도서 판매 온라인스토어" 웹사이트를 구현하였습니다.


## 📝프로젝트 소개

---

현대 비즈니스 환경에서는 업무 효율성과 소통의 중요성이 점점 더 강조되고 있습니다. 
이러한 필요성을 충족시키기 위해 우리는 Spring Boot를 활용하여 "도서판매 온라인스토어"를 위한 온라인스토어 시스템을 개발하였습니다.
이 시스템은 구매 결제, 쿠폰관리, 상품관리, 고객관리, 그리고 챗봇 기능을 통합하여 소비자와 판매자의 구매 및 판매 편의를 극대화합니다.


## ⏱개발 기간

---

- 2024.08.01(수) ~ 2024.08.23(월)
- 온라인스토어 필요기능 축약
- 아이디어 노트 작성 및 최종 결정
- 구현할 기능 정리
- 설계 발표
- 기능 설계
- 발표 평가


## 👩‍💻개발자 소개

---

- 조승범 : 팀장 / 로그인(Spring security), 소셜로그인, 회원가입, 출판사 관리, 네이버웍스 드라이브 API, CI/CD
- 김도영 : 부팀장 / 장바구니, 주문/결제, 마이페이지(쿠폰, 찜,회원정보, 회원탈퇴, 1:1문의내역, 주문내역), 이미지 검색
- 박도현 : 네이버 도서 API 연동, 홈화면, 찜하기, 장바구니 기능, 리뷰 및 별점, 이벤트룰렛 및 쿠폰 생성
- 이유진 : 
- 전용준 : 챗봇, 상품등록


## 💻개발환경

---

|프론트엔드|백엔드|협업툴|
|:---:|:---:|:---:|
|HTML|java 17|git 2.45.2|
|CSS|Spring Boot 3.2.7|github|
|JavaScript|Spring Data JPA 3.3.1|notion|
|Thymeleaf 3.1|Spring security 6|padlet| 
|jQuery 3.7.1|MariaDB|figma|
| |Mybatis 4.0.0| |
| |Websocket 2.3.4| |
| |Komoran 3.3.9| |

## 🔧주요 기능

---

- ### 📋리뷰관리
    - 

- ### 👨‍💼계정관리
    - 

- ### 🔒로그인
    - 사용자와 판매자는 역할에 따라 로그인 화면이 달라진다.
    - 사용자는 이메일로 로그인하고, 판매자는사업자 아이디로 로그인한다.
    - 사용자 로그인시 소셜 로그인이 가능하다.

- ### 👤회원가입
    - 
    - 판매자 회원가입시 사업자등록증 이미지를 S3버킷을 이용해 업로드한다.

- ### 📨네이버웍스 연동
    -   
		
- ### 🎫쿠폰 이벤트 룰렛
    - 룰렛을 돌려 나온 결과를 모달창으로 보여주고 닫기 버튼을 누르면 쿠폰이 전달된다.

- ### 📗네이버 도서 API 연동
    - json형식을 사용해서 도서 기본 검색 결과 데이터를 불러온다.
    - xml 매핑을 통해 도서 상세 결과 데이터 불러온다.

- ### ⭐️리뷰 및 별점
    - 팝업창으로 리뷰 작성 후 제출을 하면 리뷰에 페이지 담긴다
    - 관련 책에 리뷰 갯수 및 평균 별점을 계산에서 보여준다.
    - 어드민 리뷰관리 삭제 기능된다.

- ### 💗찜하기
    - 하트버튼 클릭시 해당 책 정보를 db에 저장한다.
    - 이미 데이터가 있는 경유는 기존 데이터를 사용해서 즐겨찾기에 추가된다.
    - 중복 추가 불가하다

- ### 👜장바구니
    - 버튼 클릭시 해당 책정보를 db에 저장한다.
    - 수량을 선택,변경하고 db에 저장한다.

- ### 💳결제
    - 우측 바에 주문 금액, 할인 금액, 배송비, 총 금액이 뜬다.
    - 회원가입 시 받은 배송지 정보를 가져온다.
    - 쿠폰 적용이 가능하다.
    - 실 결제가 되고 결제 완료 후 결제 상세 페이지로 넘어간다.
 
- ### 📂 마이페이지
    - 쿠폰 조회, 추가, 삭제 기능
    - 찜하기 기능
    - 회원 정보 수정
    - 회원 탈퇴
    - 1:1 문의내역
    - 주문내역 확인
	
- ### 🏠홈화면
    - 이벤트 배너가 슬라이드 형식으로 전환 된다.
    - 주로 찾는 베스트셀러 항목을 홈화면에서 바로 확인할 수 있다.
	
- ### 🤖챗봇
    - 우측 하단 토글버튼을 누르면 챗봇창이 뜨면서 웹소켓이 연결/해제된다.
    - 사용자가 질문을 채팅으로 입력하면 형태소 분석을 통해 추출한 키워드로 사용자질문의 의도를 파악한다.
    - 사용자 질문을 파악하고 의도를 통해 답변을 생성하고 필요한 서비스를 안내 및 제공한다.
	
- ### 📁상품등록
    - 도서명, 도서고유번호, 출판사, 저자 등 도서의 기본정보와 표지 이미지를 데이터베이스에 등록한다.
    - 등록한 정보는 DB에 저장되며 이미지는 S3버킷에 저장되고 url정보가 DB에 저장된다.