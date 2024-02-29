
### 0. JIRA 이슈 등록하기
이미 등록된 [자바 계산기 스토리 이슈](https://hyosung2.atlassian.net/browse/SCRUM-1?atlOrigin=eyJpIjoiMGRjNjBkOWQxMGY0NDQxZDhlOWFkODc1MWEwZjBhMWEiLCJwIjoiaiJ9)를 block 하는 Task 이슈를 생성한다.

> [더하기 기능 Task 이슈](https://hyosung2.atlassian.net/browse/SCRUM-2?atlOrigin=eyJpIjoiNDFhZjU0ZmE0OGY5NGVlNjk3MGY5ZDUyYzdlOTFiMjkiLCJwIjoiaiJ9)


### 1. Git Fork & Clone
```.git
  1.1 이 페이지 상단에 있는 fork 버튼 클릭해서 fork

  1.2 fork한 레포지토리로 이동한 다음 code 버튼 클릭해서 주소 얻기

  1.3 내 로컬에 clone 하기

    git clone <https://github.com/{github id}/java-calculator.git>
```


### 2. Git branch & checkout
```.git
  1.1 clone한 프로젝트에서 브랜치 생성
```
/*
* 0. 지라 이슈 등록
* 1. 깃 포크 및 클론
* 2. 깃 브랜치 생성 및 체크아웃
* 3. 코드 작성
*   3.1 Calculator.Operator 인터페이스 구현 클래스 생성
*   3.2 Application.java 에서 Calculator 등록
* 4. 깃 커밋 및 푸시
*   4.1 커밋 메시지에 jira 이슈 코드 추가
* 5. 깃 풀 리퀘스트
* 6. 깃 코드 리뷰
* */
