# 신한DS SW아카데미 7기 알고리즘 스터디

코딩테스트 준비를 위해 만들어진 저장소입니다.  
많은 분들의 참여 바랍니다.  
다같이 으쌰으쌰 해서 6개월동안 의미 있게 보내고  
많은 것 얻어가시면 좋겠습니다! 

---


  

## 0. 이 저장소에서 꼭 기억할 3가지

1. 문제는 `problems/`에 기록합니다.
2. 풀이는 `solutions/`에 **언어별 구역**으로 저장합니다.
3. 작업이 끝나면 IDE또는 로컬 폴더에서 바로 `push`합니다.

---

## 1. 저장소 구조 한눈에 보기

```bash
.
├── README.md
├── docs/
│   ├── STUDY_RULES.md
│   └── ADMIN_GUIDE.md
├── problems/
│   ├── README.md
│   ├── week01/README.md
│   └── week02/README.md
└── solutions/
    ├── README.md
    ├── python/
    │   └── README.md
    ├── java/
    │   └── README.md
    ├── cpp/
        └── README.md
```

---

## 2. 완전 초보용: 10분 참여 가이드

### STEP 1) 저장소 받기

```bash
git clone <repo-url>
cd coding-study
```

### STEP 2) 내 언어 구역 확인하기

- Python: `solutions/python/`
- Java: `solutions/java/`
- C++: `solutions/cpp/`

언어 구역 안에서 본인 이름 폴더를 만들어 사용하세요.

예시:

```bash
mkdir -p solutions/python/kimminsu
```

### STEP 3) 이번 주 문제 확인하기

- `problems/weekXX/README.md`에서 문제 목록/담당/상태를 확인

### STEP 4) 풀이 파일 만들기

예시(파이썬):

```bash
touch solutions/python/kimminsu/week01_두수의합.py
```

파일명 권장 규칙:
- `weekNN_문제이름.확장자`
- 공백 대신 `_` 사용

### STEP 5) 커밋 + push (브랜치 생성 없음)

```bash
git add .
git commit -m "feat: week01 두 수의 합 풀이 추가 (python/kimminsu)"
git push origin main
```

> IDE를 쓰는 경우: Source Control에서 Commit 후 Push 버튼만 누르면 됩니다.
> 폴더에서 Push해도 됩니다.

---

## 3. 언어별 풀이 구역 규칙

- 서로 다른 언어 구역은 건드리지 않는 것을 원칙으로 합니다.
- 본인 언어 폴더 안에서만 작업하면 충돌이 거의 없습니다.
- 공통 문서(`README.md`, `problems/`)를 수정할 때만 팀원과 간단히 소통하세요.

권장 경로:
- `solutions/python/<이름>/...`
- `solutions/java/<이름>/...`
- `solutions/cpp/<이름>/...`

---

## 4. 문제 관리 방법

1. 주차 파일 열기: `problems/week01/README.md`
2. 문제 추가
3. 담당자와 상태 업데이트

상태 예시:
- `예정`
- `진행중`
- `완료`
- `리뷰완료`
---

## 6. 자주 하는 실수

- 문제 원문을 통째로 복붙하기 (❌) → 링크/요약만 기록 (✅)
- 다른 언어 폴더 수정하기 (❌)
- 파일명을 `final.py`, `test2.cpp`처럼 모호하게 쓰기 (❌)

---

## 7. 관리자/운영자 참고

관리자 운영 가이드는 아래 문서를 참고하세요.

- `docs/ADMIN_GUIDE.md`

---


  
당부의 말씀...  
문제 풀이가 안 된다고 해서 다른 분들의 풀이를 미리 안 보셨으면 합니다.  
실력 향상에 도움이 1도 안되는 행동입니다.  
강제하지는 않겠지만 실력 향상을 위해 문제풀이는 본인 힘으로 해보시고  
안되시면 풀으신 분께 가서 도움 요청하는 식으로 진행하도록 하겠습니다  
도움 요청 받으시면 알려주는것도 공부에 도움이 많이 되니 잘 알려주시기 바랍니다.  
모른다고 절대 부끄러운것이 아니니 적극적인 참여 부탁드립니다~~~~  


스터디에 오신 것을 환영합니다.  
작게 자주 풀고, 자주 공유하면 실력이 빠르게 늘어요. 🚀
