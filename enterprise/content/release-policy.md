---

title: 'Release Policy'
weight: 60

menu:
  main:
    name: "Release Policy"
    identifier: "release-policy"

---

Camunda follows the [Camunda release policy](https://camunda.com/release-policy/) with some specific clarifications which can be found below.

## Camunda 7.24 LTS Release Policy
Camunda 7.24 LTS (Long Term Support) is the last minor release of Camunda 7. The Camunda 7.24 LTS support provides the following releases:

- **Environment Update Releases**: We perform one Environment Update release in April and one in October each year as long as Camunda 7.24 is supported. Both releases contain environment updates and bugfixes. They are fully tested and meant to be used for production systems. If new environment versions are not compatible with the current supported version, we support both versions for a grace period in parallel. All environment updates and grace periods will be announced in the [Support announcements](/announcement).
- **Patch Releases**: On the enterprise branch we perform patch releases, in which we backport the latest bug fixes. Patch releases are fully tested and are meant to be used for production systems. Patch releases do not contain new features and are only available to enterprise customers.
