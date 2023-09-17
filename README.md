# Algorithm

<div style="text-align: left;">
<img src="https://skillicons.dev/icons?i=java" alt="main-icon" height="25"/> <img src="https://skillicons.dev/icons?i=python,cpp" alt="sub1-icon" height="25"/> <img src="https://skillicons.dev/icons?i=c" alt="sub2-icon" height="25"/> <a href="https://www.acmicpc.net"><img src="https://drive.google.com/uc?export=view&id=1oZhfO8yLw-McLD1jlWv9xo3y9_olJdFW" alt="boj_rounded_icon" height="24"/></a> <a href="https://leetcode.com"><img src="https://drive.google.com/uc?export=view&id=1R2E_NwAnTgbNFFWz5TFvrKwwt9_4UmVk" alt="leetcode_icon" height="24"/></a><br><img src="https://img.shields.io/static/v1?label=Main%20Language&message=JAVA&color=9f4e13&style=for-the-badge&labelColor=222222" alt="BOJ" height="25"/> <img src="https://img.shields.io/static/v1?label=Sub%20Language&message=Python,%20CPP...&color=3f3f3f&style=for-the-badge&labelColor=222222" alt="BOJ" height="25"/><br><img src="https://img.shields.io/static/v1?label=Baekjoon%20Online%20Judge&message=Laniel88&color=0078c3&style=for-the-badge&labelColor=3c4861" alt="BOJ" height="25"/> <img src="https://img.shields.io/static/v1?label=Leet%20Code&message=Laniel88&color=b5740f&style=for-the-badge&labelColor=3f3f3f" alt="BOJ" height="25"/>
</div>

### **Repository of Algorithm studies**

알고리즘 공부 (Java, ...)

#### 🏁 Shortcut

- [RULES](##Rules)
- [SNIPPETS](./snippets.json)

## Rules

### Fundamental

다음과 같은 방식으로 정리

```
{1}/{2}/{3}/코드파일
```

- 폴더의 구성방식과 이름

  - **{1} : 출처** (사이트/강의/책 등)
     - 사이트에 관한 정보와 2의 분류 기준을 `{1}/README.md`에 명시
  - **{2} : 출처 세부 분류 (티어 등)** (or 생략)
  - **{3} : 문제의 번호, 코드, 제목 등**
     - 문제에 관한 상세 정보 : `{1}/{2}/{3}/README.md`

- 코드 파일 : 파일명은 기본적으로 `main`으로 하되, 채점 사이트와 언어에 따라 변경.
  - 백준 **자바 파일**의 경우 `Main`
  - leetCode **자바 파일**의 경우 `Solution`

- 폴더/파일명은 영문 pascalCase로 표기 (가독성 떨어지면 hyphen 사용)

  ```
  # 백준 1000번(B5)의 파이썬 첫번째와 두번째 풀이
  BaekjoonOnlineJudge/Bronze5/1000/main.py
  BaekjoonOnlineJudge/Bronze5/1000/main2.py
  ```

### Comment

최상단/최하단

#### 미완성/ 진행중인 코드 표시

```java
/* TODO : unfinished  */
/* TODO : could be improved */
/* TODO : review code */
```

#### 풀이법

```java
/* Approach : ~, ~ */
/* Approach : DP, brute force */
```

#### 기타

```java
/* NOTE : ~, ~ */
```