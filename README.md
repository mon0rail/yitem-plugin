# yitem-plugin

 - [유튜브](https://youtu.be/myhLrw7-S0I)

플레이어의 위치(높이)와 관련된 기능을 가진 플러그인

## 설계
1. `/yitem` 명령어 입력 시, 플레이어의 현재 높이(y)에 따라 다른 아이템을 지급함.
    > y > 65: 나무 16개
    > 0 < y < 64: 돌 16개
    > y < 0: 철괴 16개

2. 만약 `/yitem` 명령어를 입력한 sender가 콘솔이라면, 오류 메시지를 출력함

3. 만약 플레이어의 인벤토리가 가득 차있다면, 오류 메시지를 출력함

## 구현

### 명령어

- 명령어 클래스 구현 및 getCommand()를 통해 명령어 등록
- instanceof을 통한 플레이어 or 콘솔 구분 `sender instanceof Player`
- 플레이어를 식별했으면 getLocation()을 통하여 위치 정보를 읽고, Y 값을 받아옴`getLocation().getY()`
- 저장된 Y 값을 변수에 담아 저장함
-  플레이어의 인벤토리가 꽉 차있는지 확인한 뒤, 플레이어의 getIntentory().addItem()으로 아이템을 지급함 `new ItemStack(Material.DIAMOND, 16)`
- 아이템 지급 후 메시지를 보냄
