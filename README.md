# Mastodon-hashtag-collector
Collects hashtags from mastodon instances and offers a central api to read them


# API description

| method | path | description | example | user-group | options |
|---|---|---|---|---|---|
| get | /hashtag/:hasthag | returns the collected messages for a hashtag | /hashtag/mastodon | any | datetime_since
| get | /trending/:hashtag | returns the most discoused hashtags | /trending/mastodon | any | time-frame
