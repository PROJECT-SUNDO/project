# 🌏한강 수자원관리 종합정보플랫폼Ⅱ💧

## 🌞프로젝트 개요
### 📢프로젝트 소개
- **프로젝트명 : 한강 수자원관리 종합정보풀랫폼Ⅱ** 
- **프로젝트 필요성**
    - **비전** : 효율적인 수자원관를 위한 수자원 통합 관리 정보 시스템 도입 필요
    - 수자원 통합 관리 정보 시스템 구축
        - 한강유혁의 수자원 관리 정보 시스템 구축을 통해 <span style="color:steelblue">수자원 관리 효율성 제고</span>
        - 수자원 정보공유 체계 구축을 통한 <span style="color:steelblue">수자원 관리 체계 강화</span>
    - 체계적인 수자원 <span style="color:steelblue">정보 관리 실현</span>
        - 체계적인 수문 자료 관리
        - 수자원정보 활용 증대
    - 수자원관리 효율성 증대
        - 수자원 통합 관리 시스템 활용을 통한 <span style="color:steelblue">관련기관간 수자원 관리 효율성 확보</span>
- **프로젝트 목표**
    - 수자원 통합 관리 시스템을 통해 효율적인 한강 수자원 관리 솔루션 마련
    - 수문정보관리, 수문시설물관리, 물사용관리 등 수자원과 관련된 다양한 정보를 통합하여 관리하는 GIS 기반의 시스템을 구축

### 🧑‍💻개발자소개

- 개발인원 : 5명
- 개발자

  | 개발자 | 깃허브 | 역할분담  | 
  |-----|-----|-------|
  | 김은지 | [GitHub](https://github.com/3un3un) | 1     |
  | 양형경 | [GitHub](https://github.com/yhg1024) | 1     |
  | 윤예지 | [GitHub](https://github.com/Yeji-Yoon) | 1     |
  | 이윤희 | [GitHub](https://github.com/yunii118) | 1     |
  | 이지은 | [GitHub](https://github.com/dkumylove) | 1     |


### 🗓️개발기간

- 2024.02.05 ~ 2024.03.05

## 💻개발환경 ⚙️기술스텍
![개발환경.png](/img/개발환경.png)

## 📈Screen Flow Chart
![플로우차트.png](/img/플로우차트.png)

## 📋ERD


## 📑기능명세

<details>
<summary>🔎미리보기</summary>

| 지도 | 목록 | 대시보드 |
|----|----|------|
| 1) | 1  | 1    |


</details>

---

### ▶️ MAP(지도)

#### 📖 지도 : 뷰

- 지도선택 : 일반지도/ 위성지도 
- 전체 줌 레벨 조정
- 확대/ 축소
- 거리/ 면적 계산
- 저장하기 : 이미지 저장(png)/ PDF저장
- 레이어 범례
- 인덱스맵 : 위치이동

#### 📖 지도 : 수위

- 수위 메뉴
- 검색 : 관측소 명
- 관측소 목록 : 관측소명/ 실시간 관측값
- 관측소 목록 정렬 순
    - 수위(기본), 상류, 하류, 관측소명 
- 장비/통신 오류 및 결측 시 엑스(x) 아이콘 출력
- 마크 클릭 시 수위 관측소 기본 정보 팝업 출력
    - 관측소 명, 관측소 코드, 현재 수위, 수위변화, 관측소 주소

#### 📖 지도 : 강수량

- 강수량 메뉴
- 검색 : 관측소 명
- 관측소 목록 : 관측소명/ 실시간 관측값
- 관측소 목록 정렬 순
    - 수위(기본), 관측소명
- 마크 클릭 시 수위 관측소 기본 정보 팝업 출력
    - 관측소 명, 관측소 코드, 현재 강수량, 누적강수량, 관측소 위치
- 수위관측소가 설정한 수위가 이상치를 넘었을 경우의 마크

#### 📖 지도 : 유량

- 유량 메뉴
- 검색 : 관측소 명
- 관측소 목록 : 관측소명/ 실시간 관측값
- 관측소 목록 정렬 순
    - 유량, 관측소명
- 마크 클릭 시 수위 관측소 기본 정보 팝업 출력
    - 관측소 명, 관측소 코드, 현재 유량 값, 관측소 위치

#### 📖 지도 : CCTV

- CCTV 메뉴
- 검색 : CCTV 지점명
- CCTV 목록 : 지점명/ 상태
- 관측소 목록 정렬 순
    - CCTV 지점명, 상태
- CCTV 마크 클릭시 실시간 CCTV 화면 팝업

---

### ▶️ LIST(목록)

#### 📖

-
-

---

### ▶️ DASHBOARD(대시보드)

#### 📖 대시보드 : 공통

- 검색 : 관측소명, 관측소 코드
- 월/연 단위별 보기 선택
- 관측 값 조회 결과 엑셀 다운로드

#### 📖 대시보드 : 강수량

- 강수량 상세정보 표출
    - 표, 그래프, 누적 강수량 그래프
    - 검색하기 전 전체 정보 표출

#### 📖 대시보드 : 수위

- 수위량 상세정보 표출
    - 표, 그래프, 수위 상승 하강 그래프
    - 검색하기 전 전체 정보 표출

#### 📖 대시보드 : 유량

- 수위량 상세정보 표출
    - 표, 그래프
    - 검색하기 전 전체 정보 표출

---

