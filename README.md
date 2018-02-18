# Spring Integration in 10 minutes

## Overview

이번 프로젝트에서 Spring Integration을 쓰게 될 일이 있어서 알아보다가, 2009년에 Mark Fisher가 작성한 Spring Integration in 10 minutes( https://spring.io/blog/2009/02/13/spring-integration-in-10-minutes ) 라는 글과, 그 글의 번역본인 10분만에 Spring Integration 따라잡기( http://ryudaewan.tistory.com/231 )라는 글을 보게 되었다.

이 저장소는 10분만에 Spring Integration 따라잡기를 직접 해보고, 실제와 동일한 Step대로 작성하고 Commit 해 가면서 만들어진 소스 코드다.

## Another point

이 프로젝트가 원문인 Spring Integration in 10 minutes 와 다른 점은 다음과 같다.

* 원문은 1단계에서 Spring Integration 배포본을 내려받는 것으로 시작하지만, 난 그냥 빈 프로젝트를 생성하는 것으로 대체했다.
* 원문은 2단계에서, 이 프로젝트는 매우 작고 간단한 프로젝트임을 이유로, 따로 빌드 도구를 사용하지 않고 직접 jar 파일을 프로젝트에 포함하고 참조하지만, 이 프로젝트는 Gradle을 사용해서 의존성을 관리한다.
* 원문은 Spring Integration 1.0.1을 사용하지만, 이 프로젝트는 4.3.14 버전을 사용한다.
* 원문은 blog 패키지를 사용하지만, 이 프로젝트는 kr.ayukawa 프로젝트를 사용한다. ~~취향입니다, 존중해주시죠~~
* 원문은 3단계에서 Spring Integration의 스키마를 위한 네임스페이스로 si를 사용하지만(아마도 Spring Integration의 이니셜인것 같다), 이 프로젝트는 int를 사용한다.
* 원문은 스프링 컨테이너를 위한 환경파일 이름으로 config.xml을 사용하지만, 이 프로젝트는 applicationContext.xml을 사용한다. 또한, 해당 xml 파일을 blog 패키지 폴더에 두는 것으로 했지만, 이 프로젝트는 어플리케이션의 루트 디렉토리에 둔다.
* 원문은 5단계에서 메시지를 전달하기 위한 send 메서드의 인자로 StringMessage 클래스의 인스턴스를 이용하지만, 이 프로젝트는 MessageBuilder 클래스를 이용해서 메시지 인스턴스를 생성한다. StringMessage 클래스는 Spring Integration 1 버전대에서 2 버전으로 넘어가면서 사라진 클래스로, 현재의 Spring Integration과는 맞지 않는다.

## Note.

원문의 9단계를 그대로 진행하고 실행해보면 화면에 로깅 메시지만 표시되고, 실행결과는 표시되지 않는다.

원문을 보면 알겠지만, 9단계는 메시지의 결과를 파일로 출력하게 되며, 출력된 파일은 Gradle의 run task로 실행한 경우를 기준으로, ```build/classes/java/main``` 폴더의 *.msg 파일이다.
