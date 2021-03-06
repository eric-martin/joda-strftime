# joda-strftime

[![Build Status](https://travis-ci.org/eric-martin/joda-strftime.png)](https://travis-ci.org/eric-martin/joda-strftime)

A strftime DateTimeFormat object for the Joda-Time library

## Usage

```java
DateTimeFormatter formatter = StrftimeDateTimeFormat.forPattern(strftimePattern);
...
```

## Installation

Add it as a maven dependency:
```xml
<dependency>
  <groupId>com.triptheone</groupId>
  <artifactId>joda-strftime</artifactId>
  <version>1.0.0</version>
</dependency>
```

## License

Copyright 2013 Eric Martin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

