import{_ as ve}from"./VPagination.vuevuetypescriptsetuptruelang-DJTUsUyq.js";import{d as fe,h as I,g as ke,I as ye,u as be,i as Ce,s as $e,J as we,K as Ae,L as Te,M as qe,c as l,a,t as i,m as t,p as d,O as D,x as m,w as u,e as f,P as Ie,v as De,Q as Se,bn as Le,f as Me,C as Ve,bs as Ee,S as Ne,o as n,N as Ue,b8 as Be,ap as O,V as X,U as Z,X as Ke,a0 as Qe,a1 as k,bt as j,Z as W,ac as Pe,ad as ze,$ as He,ae as Re,a2 as Fe,a3 as Ge,a4 as Je}from"./index-BzaaAwnX.js";import{_ as Oe,a as Xe}from"./SearchInput-DTMVECJE.js";import{b as Ze,u as je,a as We}from"./key-events-C5OjC_dP.js";import{u as Ye,a as xe}from"./tags-BvnEKqTV.js";import{u as et}from"./search-DwB6FdxH.js";import"./search-rounded-Btuwf-IQ.js";import"./rss-feed-rounded-9FbiHzkN.js";import"./vee-validate.esm-DNjIRPsN.js";const tt={class:"top-app-bar"},at={class:"title"},st={class:"actions"},ot=a("md-ripple",null,null,-1),nt=a("md-ripple",null,null,-1),lt={class:"table-responsive"},it={class:"table"},ct=["checked","indeterminate"],dt={key:0},rt=a("th",null,null,-1),ut=["onClick"],_t=["onChange","checked"],pt={key:0},ht=["onClick"],mt={class:"nowrap"},gt={class:"action-btns"},vt=["onClick"],ft=a("md-ripple",null,null,-1),kt=["onClick"],yt=a("md-ripple",null,null,-1),bt={class:"nowrap"},Ct={class:"nowrap"},$t={key:0},wt=["colspan"],At={class:"no-data-placeholder"},g=50,Ut=fe({__name:"AIChatsView",setup(Tt){var R;const y=I([]),{t:Y}=ke(),{parseQ:x}=et(),S=ye({tagIds:[]}),ee=be(),te=Ce(),{app:w}=$e(te),r=we.AI_CHAT,L=Se(),M=L.query,A=I(parseInt(((R=M.page)==null?void 0:R.toString())??"1")),_=I(""),{tags:b,fetch:ae}=Ye(r),{addToTags:se}=xe(r,b),{deleteItems:V}=Ze(Le,()=>{$()}),{selectedIds:v,allChecked:E,realAllChecked:C,selectRealAll:oe,allCheckedAlertVisible:ne,clearSelection:T,toggleAllChecked:N,toggleSelect:U,total:c,checked:B,selectAll:le}=je(y),K=e=>{const o=L.query.q;Me(ee,o?`/aichats?page=${e}&q=${o}`:`/aichats?page=${e}`)},{keyDown:Q,keyUp:P}=We(c,g,A,le,T,K,()=>{V(C.value,v.value,_.value)}),{loading:ie,fetch:$}=Ae({handle:(e,o)=>{o?Ve(Y(o),"error"):e&&(y.value=e.aiChats,c.value=e.aiChatCount)},document:Ee,variables:()=>({offset:(A.value-1)*g,limit:g,query:_.value}),appApi:!0});function ce(e){return e?`/aichats?q=${e}`:"/aichats"}const z=e=>{e.type===r&&(T(),$())},H=e=>{e.type===r&&$()};Te(()=>{var e;_.value=Qe(((e=M.q)==null?void 0:e.toString())??""),x(S,_.value),ae(),$(),k.on("item_tags_updated",H),k.on("items_tags_updated",z),window.addEventListener("keydown",Q),window.addEventListener("keyup",P)}),qe(()=>{k.off("item_tags_updated",H),k.off("items_tags_updated",z),window.removeEventListener("keydown",Q),window.removeEventListener("keyup",P)});function de(e){j(`/aichats/${e.id}`)}function re(){j("/aichats/create")}function ue(e){W(ze,{id:e.id,name:e.id,gql:Pe`
      mutation DeleteAIChat($query: String!) {
        deleteAIChats(query: $query)
      }
    `,variables:()=>({query:`ids:${e.id}`}),appApi:!0,typeName:"AIChat",done:()=>{c.value--,e.tags.length&&k.emit("refetch_tags",r)}})}function _e(e){W(He,{type:r,tags:b.value,item:{key:e.id,title:"",size:0},selected:b.value.filter(o=>e.tags.some(q=>q.id===o.id))})}return(e,o)=>{const q=Oe,F=Re,G=Fe,pe=Xe,he=Ge,me=Je,ge=ve,p=Ne("tooltip");return n(),l(D,null,[a("div",tt,[a("div",at,i(e.$t("page_title.aichats"))+" ("+i(t(c).toLocaleString())+")",1),a("div",st,[d(q,{filter:S,tags:t(b),"get-url":ce},null,8,["filter","tags"]),t(B)?(n(),l(D,{key:0},[m((n(),l("button",{class:"btn-icon",onClick:o[0]||(o[0]=u(s=>t(V)(t(v),t(C),t(c),_.value),["stop"]))},[ot,d(F)])),[[p,e.$t("delete")]]),m((n(),l("button",{class:"btn-icon",onClick:o[1]||(o[1]=u(s=>t(se)(t(v),t(C),_.value),["stop"]))},[nt,d(G)])),[[p,e.$t("add_to_tags")]])],64)):f("",!0),a("md-outlined-button",{class:"btn-sm",onClick:u(re,["prevent"])},i(e.$t("new_chat")),1)])]),d(pe,{limit:g,total:t(c),"all-checked-alert-visible":t(ne),"real-all-checked":t(C),"select-real-all":t(oe),"clear-selection":t(T)},null,8,["total","all-checked-alert-visible","real-all-checked","select-real-all","clear-selection"]),a("div",lt,[a("table",it,[a("thead",null,[a("tr",null,[a("th",null,[a("md-checkbox",{"touch-target":"wrapper",onChange:o[2]||(o[2]=(...s)=>t(N)&&t(N)(...s)),checked:t(E),indeterminate:!t(E)&&t(B)},null,40,ct)]),t(w).developerMode?(n(),l("th",dt,"ID")):f("",!0),a("th",null,i(e.$t("content")),1),rt,a("th",null,i(e.$t("tags")),1),a("th",null,i(e.$t("updated_at")),1),a("th",null,i(e.$t("created_at")),1)])]),a("tbody",null,[(n(!0),l(D,null,Ie(y.value,(s,J)=>(n(),l("tr",{key:s.id,class:Ue({selected:t(v).includes(s.id)}),onClick:u(h=>t(U)(h,s,J),["stop"])},[a("td",null,[a("md-checkbox",{"touch-target":"wrapper",onChange:h=>t(U)(h,s,J),checked:t(v).includes(s.id)},null,40,_t)]),t(w).developerMode?(n(),l("td",pt,[d(he,{id:s.id,raw:s},null,8,["id","raw"])])):f("",!0),a("td",null,[a("a",{href:"#",onClick:u(h=>de(s),["prevent"])},i(t(Be)(s.content,{length:200,omission:""})),9,ht)]),a("td",mt,[a("div",gt,[m((n(),l("button",{class:"btn-icon sm",onClick:u(h=>ue(s),["stop"])},[ft,d(F)],8,vt)),[[p,e.$t("delete")]]),m((n(),l("button",{class:"btn-icon sm",onClick:u(h=>_e(s),["stop"])},[yt,d(G)],8,kt)),[[p,e.$t("add_to_tags")]])])]),a("td",null,[d(me,{tags:s.tags,type:t(r)},null,8,["tags","type"])]),a("td",bt,[m((n(),l("time",null,[X(i(t(Z)(s.updatedAt)),1)])),[[p,t(O)(s.updatedAt)]])]),a("td",Ct,[m((n(),l("time",null,[X(i(t(Z)(s.updatedAt)),1)])),[[p,t(O)(s.createdAt)]])])],10,ut))),128))]),y.value.length?f("",!0):(n(),l("tfoot",$t,[a("tr",null,[a("td",{colspan:t(w).developerMode?7:6},[a("div",At,i(e.$t(t(Ke)(t(ie)))),1)],8,wt)])]))])]),t(c)>g?(n(),De(ge,{key:0,page:A.value,go:K,total:t(c),limit:g},null,8,["page","total"])):f("",!0)],64)}}});export{Ut as default};
