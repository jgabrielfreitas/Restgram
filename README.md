# Jersey + Kotlin = Awesome REST API

Rest API with Kotlin playground


### Usage
**[GET]**
+ `/restgram/insta/gram/{name}` to generate a random user with name and id

**[POST]**
+ `/restgram/user/create` to add a new Person

```
{
  "id": "c1284046-b1ef-410b-a65b-992799a714a2",
  "name": "João"
}
```

**[GET]**
+ `/restgram/user/users` to select all persons

```
[
  {
    "id": "917acfde-dda9-467e-9617-abd1778a9643",
    "name": "Freitas"
  },
  {
    "id": "c1284046-b1ef-410b-a65b-992799a714a2",
    "name": "João"
  }
]
```