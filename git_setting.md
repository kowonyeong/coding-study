# Git/GitHub 처음 시작 가이드

이 문서는 **Git을 처음 사용하는 사람**을 위해, 설치부터 GitHub 가입, 로컬 초기 설정까지 한 번에 따라 할 수 있도록 정리한 안내서입니다.

---

## 1) Git이란?

- **Git**: 코드 변경 이력을 저장하고 되돌릴 수 있게 해주는 버전 관리 도구
- **GitHub**: Git 저장소를 온라인에서 관리/공유하는 서비스

쉽게 말해,
- Git = 내 컴퓨터에서 버전 관리
- GitHub = 인터넷에 백업하고 협업하는 공간

---

## 2) Git 설치하기

아래에서 본인 운영체제에 맞게 설치하세요.

### Windows
1. [https://git-scm.com/download/win](https://git-scm.com/download/win) 접속
2. 설치 파일 다운로드 후 실행
3. 대부분 기본 옵션(Next)으로 진행해도 무방
4. 설치 후 **Git Bash** 실행

### macOS
#### 방법 A: Homebrew 사용 (권장)
```bash
brew install git
```

#### 방법 B: 공식 설치 파일
- [https://git-scm.com/download/mac](https://git-scm.com/download/mac)

### Ubuntu / Debian
```bash
sudo apt update
sudo apt install git -y
```

### 설치 확인
```bash
git --version
```
버전 정보가 나오면 정상 설치입니다.

---

## 3) GitHub 회원가입

1. [https://github.com](https://github.com) 접속
2. 우측 상단 **Sign up** 클릭
3. 이메일, 비밀번호, 사용자명 입력
4. 인증 절차(이메일 인증 포함) 완료
5. 로그인

> 사용자명(username)은 나중에 저장소 주소에 포함되므로 너무 즉흥적으로 정하지 않는 것을 추천합니다.

---

## 4) Git 로컬 초기 설정 (필수)

처음 한 번만 설정하면 됩니다.

### 4-1) 사용자 이름 설정
```bash
git config --global user.name "홍길동"
```

### 4-2) 이메일 설정
```bash
git config --global user.email "you@example.com"
```

- 이 이메일은 GitHub 계정 이메일과 같게 맞추는 것이 일반적입니다.
- 커밋 작성자 정보에 사용됩니다.

### 4-3) 기본 브랜치 이름을 main으로 설정 (권장)
```bash
git config --global init.defaultBranch main
```

### 4-4) 설정 확인
```bash
git config --global --list
```

---

## 5) (선택) 줄바꿈 문제 방지 설정

운영체제마다 줄바꿈 차이(CRLF/LF)로 파일이 불필요하게 변경되는 문제를 줄일 수 있습니다.

### Windows
```bash
git config --global core.autocrlf true
```

### macOS / Linux
```bash
git config --global core.autocrlf input
```

---

## 6) (선택) 기본 에디터 설정

예: VS Code를 기본 편집기로 설정
```bash
git config --global core.editor "code --wait"
```

---

## 7) 초기 저장소 연결 세팅

저장소 주소:
`https://github.com/kowonyeong/coding-study.git`

```bash
# 1) 원하는 위치로 이동 (예: 바탕화면)
cd ~/Desktop

# 2) 저장소 clone
git clone https://github.com/kowonyeong/coding-study.git

# 3) 저장소 폴더로 이동
cd coding-study

# 4) 내 작업 폴더와 파일 생성
coding-study/solutions/python/고원영/week1_test.py

# 7) 파일 add
git add week1_test.py
git add . (이렇게 전체 파일 올려도 무방)

# 8) 커밋
git commit -m "1주차 문제 풀이" (커밋 텍스트는 상황에 맞게 변경)

# 9) 원격 저장소 확인 (clone했기 때문에 보통 이미 origin이 연결됨)
git remote -v

# (선택) origin이 없다면 아래로 연결
# git remote add origin https://github.com/kowonyeong/coding-study.git

# 10) main 브랜치로 push
git push -u origin main
```

> 참고: 협업 저장소에서는 권한이 없으면 push가 거절될 수 있습니다. 그런 경우 본인 저장소로 Fork 후 push하거나, 권한을 요청하세요.

---

## 8) 자주 쓰는 기본 명령어

```bash
git status        # 현재 상태 확인
git add .         # 변경 파일 스테이징
git commit -m "메시지"  # 커밋
git push          # 원격 저장소로 업로드
git pull          # 원격 변경사항 가져오기
git log --oneline # 커밋 이력 간단 보기
```

---

## 9) 문제 해결 팁

### Q1. `git: command not found`
- Git 미설치이거나 PATH 문제입니다. 설치 후 터미널 재시작하세요.

### Q2. 커밋할 때 이름/이메일 오류
- 아래 명령으로 재설정하세요.
```bash
git config --global user.name "내이름"
git config --global user.email "내이메일"
```

### Q3. `fatal: Authentication failed`
- GitHub 로그인 정보(토큰) 또는 권한 문제일 수 있습니다.
- GitHub에서 Personal Access Token(PAT)을 발급해 비밀번호 대신 사용하세요.

---

## 10) 체크리스트

- [ ] Git 설치 완료 (`git --version` 확인)
- [ ] GitHub 회원가입 및 로그인 완료
- [ ] `user.name`, `user.email` 설정 완료
- [ ] 기본 브랜치 `main` 설정 완료
- [ ] 첫 저장소 push 완료

이제 Git/GitHub를 사용할 준비가 되었습니다 🎉
