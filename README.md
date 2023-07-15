# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 페어 프로그래밍 규칙

* 5분마다 driver와 navigator를 교체한다.
* commit message는 angular convention을 따른다.
* 요구사항 별로 commit하며 누락된 경우가 있는 경우 추가적으로 commit한다.
* 서로의 의견을 내고 너무 길어질 시 작성된 코드를 따르고 추후에 의논한다.
* PR 기한
    * 1단계 PR: 7월 11일 (화) 18시까지
    * 2단계 PR: 7월 13일 (목) 18시까지

## 요구 사항 분석

### 1단계 미션

- [x] 로또 번호는 1 이상 45 이하의 자연수 값을 가진다.
- [x] 로또는 6개의 로또 번호를 가진다.
- [x] 로또는 중복된 로또 번호를 가질 수 없다.
- [x] 당첨 로또는 로또와 보너스 로또 번호로 구성된다. (6개의 로또 번호 + 1개의 보너스 로또 번호)
    - [x] 로또의 로또 번호와 보너스 로또 번호는 중복될 수 없다.


- [x] 로또와 당첨 로또의 번호를 비교해서 등수를 산출한다.
    - [x] 1등: 6개 로또 번호 일치 -> 2,000,000,000원
    - [x] 2등: 5개 로또 번호, 1개 보너스 번호 일치 -> 30,000,000원
    - [x] 3등: 5개 로또 번호 일치 -> 1,500,000원
    - [x] 4등: 4개 로또 번호 일치 -> 50,000원
    - [x] 5등: 3개 로또 번호 일치 -> 5,000원


- [x] 로또 결과에서 당첨 통계와 수익률을 구할 수 있다.
    - [x] 당첨 통계는 1등부터 꽝까지 구한다.
    - [x] 수익률은 (전체 당첨 금액)/(구입 금액)이다.


- [x] 사용자는 로또를 구매할 수 있다.
    - [x] 사용자는 구입 금액을 입력할 수 있다.
        - [x] 로또 하나의 가격은 1,000원이다.
        - [x] 구입 금액은 1,000원 단위의 자연수이다.
    - [x] 사용자는 수동으로 구매할 로또 수를 입력할 수 있다.
      - [x] 이어서 수동으로 구매할 번호를 입력할 수 있다.
      - [x] 나머지 로또의 로또 번호는 임의로 정해진다.


- [x] 사용자는 수동으로 구입한 로또 개수와 자동으로 구입한 로또 개수를 확인할 수 있다.
- [x] 사용자는 구입한 로또의 로또 번호를 확인할 수 있다.
    - [x] 출력 결과의 접두어는 `[`이고 접미어는 `]`이다.
    - [x] 출력 결과의 구분자는 `, `이다.
    - [x] 출력 결과는 로또 번호의 크기를 오름차순으로 출력한다.


- [x] 사용자는 지난 주 당첨 로또의 로또 번호를 입력할 수 있다.
    - [x] 6개의 로또 번호를 입력한 후 1개의 보너스 로또 번호를 입력한다.


- [x] 사용자는 당첨 통계와 수익률을 확인할 수 있다.
    - [x] 1등부터 5등까지 당첨 통계를 출력한다.
    - [x] 수익률은 소수점 두 자리까지 내림하여 출력한다.
  