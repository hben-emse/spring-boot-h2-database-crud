{{ range .Versions }}
## [{{ .Tag.Name }}] - {{ datetime "2006-01-02" .Tag.Date }}
{{ range .CommitGroups -}}
### {{ .Title }}
{{ range .Commits -}}
- {{ .Header }}
  {{ end }}
  {{ end -}}
  {{- if .RevertCommits -}}
### Reverts
{{ range .RevertCommits -}}
- {{ .Header }}
  {{ end }}
  {{ end -}}
  {{- if .MergeCommits -}}
### Merges
{{ range .MergeCommits -}}
- {{ .Header }}
  {{ end }}
  {{ end -}}
  {{ end }}
