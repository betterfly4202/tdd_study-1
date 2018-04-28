#Srping Camp 2018

###쿠팡 - 김범석 대표 연설

    오픈 커뮤니티에 도움을 받아 성장 했기 때문에 미리 후원을 했었어야 한다.
    쿠팡은 모든 분야에  기술이 중심에 있다. 기술이 제일 중요.    
    경험을 함께 나누고 싶다.
    앞으로 많은 오픈소스 커뮤니티에게 앞으로 많은 후원과 노력을 하겠다.
    
###Our journey to find Hope Coupang MSA - Lego(정재훈)
    
    쿠팡이 성장함에 필요했던 굴곡점
    1. PHP > Java 
    2. 모놀리틱 아키텍쳐> MSA변경
    3. 모든 시스템 클라우드로 이관
     
    5년전 쿠팡에 Pain Point
    모놀리틱 아키텍쳐를 사용했을 때에 Pain
    부분의 장애가 서비스의 장애로 나타나는게 빈번했었다
    작은 수정으로 인한 전체 QA가 필요 했다
    scale-out
    배포시간에 대한 비하급수적인 증가
    
    모놀로틱 > MSA 로 변환하는 과정을 Vitamin Project로 표현
    MSA는 모두 API통신을 함 
     
    Message Queue를 이용하여 주문 > 배송 프로세스 진행
    강결합 트랜젝션을 분리할 수 있었다.
     
    Configuration Management DataBase - CMDB
    서버 인스턴스 수 10,000개 이상
    자동화를 위한 제일 중요한 시스템
    서비스의 Meta정보, Infrastructure
    
    배포시스템 
    하루에 100번 ++
    하루에 2000대 이상의 인스턴스에 배포
     
    #Bolt2 
    - Build the service stack automatically
    - Support fase deployment (within a few minutes)
    - Support fase rollback (within 10 seconds)
     
    AB테스트?
    ????
     
    API GateWay - http://bcho.tistory.com/1005
    30억 이상의 호출, 10,000개 이상의 API존재
     
    배포단계 -> 트래픽이 존재하지 않는 서버배포, 한개의 서버에만 배포, 모든서버 배포
     
    Confidence System
    - Code bug
    - Performance Issue
    - Hardware Failure
    
    CirCuit Breaker
    운영중인 서버에 대한 요청 회피를 할 수 있도록 해주는 시스템
     
    Site Reliability Engineering - SRE
    
    Dynamic Properties
     
###이벤트 기반 분산 시스템을 향한 여정 - 우아한 형제들 박용권

    SCM 시스템
    공급망 관리(Supply chain management, SCM) 시스템
    
    지난 1년간 운영 개발하며 주어졌던 고민, 생각했던 아이디어, 만들었던 결과물 공유
    Service > 독립적으로 실행가능한 어플리케이션
    1개 이상의 Service와 공유 인프라가 모여 하나의 System을 구성한다.
     
    당시 물류업무는 오프라인 중심으로 처리하였다. 사람이 처리하는 것이 아닌 자동화된 시스템이 필요.
    Logistics Adapter서비스 -> Spring Boot 기반 AWS Elastic Beanstalk에서 운영
        >> 시스템간 이질적인 용어와 모델을 번역하는 역할을 수행 > 번역
           메시징 기반으로 비동기 처리 시스템간 결합 제거
           수신된 메시지에 대해 멱등성을 보장하도록 기능 개발 > 동일한 주문서에 대한 중복배송이 되지 않도록하는 것
        왜 새로운 서비스로 만들어 졌나?
        >> 복잡하게 얽히고 꼬인 레거시 시스템을 깨고 푸드 커머스 플랫폼으로 진화하기 위한 첫걸음.
        
    불어나는 기능 커지는 서비스 쌓이는 도메인 지식
    도메인 경게 발견, 그리고 SCM시스템으로 확장
    응집력 있는 도메인 개념을 묶기
    
    모듈화를 통해 얻은 것
        >> 모듈간 상호 작용은 내부 프로세스로 처리
           단일 트랜잭션 관리로 인해 강력한 일관성 확보
           IDE를 통한 손쉬운 리팩토링 작업
            
    또 다른 모놀리식 시스템화 현상
        >> 모듈간 직접참조 형식이라 너무 강결합적.
         
    이벤트 생산과 소비를 통한 느슨한 결합 (Loose Coupling)
        >> 스프링 어플리케이션 이벤트 매커니즘
     
    원격 시스템에 등장. 통합을 위한 숙제
      
    시스템 또는 서비스 통합을 위한 세가지 방법
        >> 레스트풀 API, 원격프로시저 호출 - 구글의 GRPC 등이 예, 메시징
         
    컨텍스트 간 협업을 위한 두가지 방식
        >> 동기 > 이벤트기반, 비동기 > 요청과 응답

### 11번가 Spring Cloud 기반 MSA로의 전환 - SK planet 윤용성
    
    2016년말 11번가는
    초대형 거대 Monolithic System
    8년 넘게 사용해 온 낙후된 S/W Stack
    너무나 커진 200만 라인의 공통 모듈
    폭증하는 트래픽에 노후
     
    개밪라들이 새로운 기술을 접해 볼 기회 원천 봉쇄..
    IDE에 띄우는 것 조차 번거운 개발 환경
    "나의 과감한 수정은 전사 장애다!"
     
    어떻게 서버 분리를 진행할 것인가?
    점진적 MSA 전환 프로젝트
    Project Vine 
    Legacy 교살 전략
    새로운 어플리케이션 은 독립된 API 서버로 개발
    Legacy와 함께 운영
    위의 과정을 반복
     
    업무 도메인 별로 (혹은 더 잘게 서버 분리)
    Legacy 코드에서는 새로운 API서버들을 호출
    기존 코드와 새로운 API 호출은 DB Flag를 통해 Switchable하게
     
    MSA플랫폼 솔루션 선정
    MSA를 위한 베스트 Practice를 빠르게 적용하는 것이 필요
    개발자들이 가장 친숙해하는 환경의 스프링 부트
    Srping Cloud NETPLIX
     
    Deep Dive into
    Hystrix, Ribbon, Eureka????
     
    Hystrix
    장애 전파 방지 & Resilience
    Circuit Breaker
    Fallback
    Thread Isolation
     
    Circuit Breaker
    일정시간동안 일정개수이상의 호출이 발생한 경우 일정비율이상의 에러가 발생하면 > Circuit Open(호출차단)
    일정시간경과 후에 단 한개의 요청에 대해서 호출을 허용하며 하프오픈이 호출이 성공하면 Circuit Close(호출허용)
    10초간 20개 이상의 호출이 발생한 경우 50% 이상의 에러가 발생한다
    Circuit Breaker 는 한 프로세스 내엥서 주어진 CommandKey단위로 통계를 내고 동작한다
     
    Fallback
    Circuit이 오픈되면 FallBack이 실행된다? X
    발생 요인
    Circuit Open
    Any Exception
    semaphore / threadPool Rejection
    time out
     
    사용자의 코드에서 HystrixBadRequestException을 발생하면 이 오류는 Fallback을 실행하지 않으며 Circuit Open을 위한 통계에도 집계되지 않는다. 
    Time out 조정 default는 1초
    
    Ribbon
    Spring Cloud의 Http 통신이 필요한 요소에 내장되어 있음
    
    Eureka
    
