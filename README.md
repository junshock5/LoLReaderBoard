# readerboard
목적
---
- ### 리그 오브 레전드를위한 간단한 리더 보드 백엔드 애플리케이션 작성
- 초기 데이터는 25,000 행의 데이터를 포함하며 각 행은 playerId 및 mmr (매치 메이킹 등급)로 구성됩니다.

사용 기술
---
- Maven Project
- Java 8
- Junit 4
- assertj

기술적인 집중 요소
---
- 객체지향의 기본 원리와 의미 있는 코드 작성
- 라이브러리 및 기능 추가 시 이유 있는 선택과 사용 목적 고려
- 테스트 코드 작성

REST API 사양
---
1. 총 플레이어 수를 반환하는 API
2. 플레이어의 계층을 반환하는 API
3. 상위 10 개 플레이어 목록을 반환하는 API
4. 주어진 플레이어 ID 근처의 플레이어 목록을 반환하는 API. 
예) playerId가 5이고 범위가 5 인 경우. 5 명의 상위 플레이어와 5 명의 하위 플레이어를 찾아야합니다.
5. 플레이어를 업데이트 / 추가하는 API (리더 보드도 업데이트해야 함)
6. 플레이어 삭제 API

플레이어 모델은
- long playerId
- int mmr
- int rank
- Tier tier

계층 모델은 다음으로 구성됩니다.
- CHALLENGER // top 100 players
- MASTER, // top 1% players
- DIAMOND, // top 5% players
- PLATINUM, // top 10% players
- GOLD, // top 25% players
- SILVER, // top 65% players
- BROZNE, // others

설계 고려 사항
---

실행 방법
---

참고
---
### **Java8 표준 라이브러리 주소** <br/> https://docs.oracle.com/javase/8/docs/api/