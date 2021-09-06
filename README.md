Техническое задание

Создать сервис, который обращается к сервису курсов валют, и отдает gif в ответ:
если курс по отношению к рублю за сегодня стал выше вчерашнего, то отдаем рандомную отсюда https://giphy.com/search/rich ; если ниже - отсюда https://giphy.com/search/broke .
Must Have:
Сервис на Spring Boot 2 + Java / Kotlin. Запросы приходят на HTTP endpoint, туда передается код валюты. Для взаимодействия с внешними сервисами используется Feign .Все параметры (валюта по отношению к которой смотрится курс, адреса внешних сервисов и т.д.) вынесены в настройки. На сервис написаны тесты (для мока внешних сервисов можно использовать @mockbean или WireMock). Для сборки должен использоваться Gradle.
