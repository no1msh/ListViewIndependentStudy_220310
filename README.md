# ListViewIndependentStudy_220310
ListView에 대해서 복습하는 프로젝트입니다.

<hr>

### ListView 사용의 순서

> 0. ListView를 배치하고싶은 액티비티 -> Main , Character의 특성을 보여주는 ListView의 제작 과정

> 1. activity_main.xml에 ListView 추가

> 2. character_list_item.xml 추가 (ListView의 아이템의 데이터의 기본 틀을 추가)

> 3. CharacterData.kt 클래스 추가 (Character의 특성을 나타낼 클래스 추가)

> 4. CharacterAdapter.kt 클래스 추가 (Character의 데이터 형식을 맞춘 값을 ListView의 각 아이템에 뿌려주는 역할을 함)

> 5. MainActivity.kt 수정 ( 멤버변수로 Character 값을 쭉 저장하는 ArrayList<CharacterData> 선언 및 데이터 추가, xml의 ListView와 CharacterAdapter 연결)
  
> 6. CharacterAdapter.kt 수정 ( Character_list_item에 있는 데이터를 표현할 각 View들을 id로 연결 , position에 해당하는 값들 View들에게 대입 )
  
> 7. [필요시] MainActivity 수정 ( 각 item들 setOnItemClickListener 설정 및 setOnItemLongClickListener 설정 ) 
