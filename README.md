# Algorithm

<div style="text-align: left;">
<img src="https://skillicons.dev/icons?i=java" alt="main-icon" height="25"/> <img src="https://skillicons.dev/icons?i=python,cpp" alt="sub1-icon" height="25"/> <img src="https://skillicons.dev/icons?i=c," alt="sub2-icon" height="25"/><br><img src="https://img.shields.io/static/v1?label=Main%20Language&message=JAVA&color=9f4e13&style=for-the-badge&labelColor=3f1a00" alt="BOJ" height="25"/> <img src="https://img.shields.io/static/v1?label=Sub%20Language&message=Python,%20CPP...&color=3f3f3f&style=for-the-badge&labelColor=222222" alt="BOJ" height="25"/><br><img src="https://img.shields.io/static/v1?label=Baekjoon%20Online%20Judge&message=Laniel88&color=0078c3&style=for-the-badge&labelColor=3c4861" alt="BOJ" height="25"/> <img src="https://img.shields.io/static/v1?label=Leet%20Code&message=Laniel88&color=ffa116&style=for-the-badge&labelColor=3f3f3f" alt="BOJ" height="25"/>

</div>

### **Repository of Algorithm studies**

알고리즘 공부 내용을 정리하고 있는 레파지토리입니다.

> 주 언어는 Java이며, 필요에 따라 C++, Python과 기타 언어도 사용합니다.
>
> 참고 자료(AC), 문제 내용 등을 비롯한 몇몇 파일들은

## Rule

다음과 같은 방식으로 정리한다.

```
{1}/{2}/{3}/코드파일
```

- 폴더의 구성방식과 이름은 다음과 같다.

  1. **1 : 출처** (사이트/강의/책 등)
     - 사이트에 관한 정보와 2의 분류 기준을 `{1}/README.md`에 명시한다.
  2. **2 : 해당 출처에 맞는 방식대로 분류한 폴더명**
     - 분류할 필요가 없다면, 생략한다.
  3. **3 : 문제의 번호, 코드, 제목 등**
     - 문제에 관한 상세 정보는 `{1}/{2}/{3}/README.md`에 적는다.

- 코드 파일 : 파일명은 다음과 같다.

  ```
  main{분류}.{확장자}
  ```

  > 분류 :
  >
  > - 같은 문제와 언어에 대해 여러 종류의 코드가 있을 때 구별하기 위해 사용
  > - "", 2, 3, 4 .. 로 표기
  > - 🙏 자바 파일의 경우 `main` 대신 `Main`으로 한다.

- 특별한 이유가 없다면 폴더/파일명은 영어로 적으며, 파스칼 케이스(pascal case)로 표기한다.

  - 단, 출처 폴더(1)의 가독성이 너무 떨어진다면 \_로 구분한다.

- 예를 들어, 백준 1000번(브론즈 V) 문제의 파이썬 첫번째, 두번째 풀이의 경우:

  ```
  BaekjoonOnlineJudge/Bronze5/1000/main.py
  BaekjoonOnlineJudge/Bronze5/1000/main2.py
  ```

---

## ETC

### 외부 코드

👩🏻‍💻 학습을 위헤 다른 사람의 코드, 공식 해설, AC 등을 가져올 때는 파일명(3)을 따르지 않고 `ref{num}`로 파일명을 설정해 구분한다.

- 예시 :
  ```
  BaekjoonOnlineJudge/Bronze5/1000/ref1.cpp
  ```
- 주석에 출처를 표기한다.
- github에는 올리지 않는다 (gitignore)

### 이론별 정리

알고리즘의 이론별로 정리하지 않고 위의 방식대로 정리하되,  
분류가 필요한 문제들은 [`classification.md`](./classification.md)에 따로 링크한다.

### 미완성/ 진행중인 코드 표시

코드 상단에 TODO 주석을 넣는다.

검색을 위해 다음 용도에 대한 주석은 고정 :

- `TODO : unfinished` (미완성 또는 틀린 코드)
- `TODO : could be improved`
- `TODO : review code`

메모는 TODO와 같이 작성한다. -> `NOTE : ~`
