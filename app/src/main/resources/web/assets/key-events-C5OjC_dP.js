import{h as y,aH as k,g as K,C,Z as N,c7 as S}from"./index-BzaaAwnX.js";const D=r=>{const i=y(!1),c=y(!1),t=y(0),e=y([]),a=y(null),n=y([]),l=y(!1),v=s=>{s?i.value=r.value.every(u=>e.value.includes(u.id)):(i.value=!1,c.value=!1)},f=s=>{const u=Math.min(a.value,s),o=Math.max(a.value,s),g=r.value[a.value].id;return r.value.slice(u,o+1).map(m=>m.id).filter(m=>m!==g)},h=(s,u)=>{if(a.value!==null&&a.value!==u&&n.value.length>0){if(l.value)for(const o of n.value)e.value.includes(o)||e.value.push(o);else e.value=e.value.filter(o=>!n.value.includes(o));n.value=[],a.value=u,l.value=e.value.includes(s.id),v(l)}else d(!e.value.includes(s.id),s,u)},d=(s,u,o)=>{s?e.value.push(u.id):e.value=e.value.filter(g=>g!==u.id),a.value=o,l.value=s,v(s)},p=()=>{i.value=!0,e.value=r.value.map(s=>s.id)};return{realAllChecked:c,allChecked:i,toggleAllChecked:s=>{s.target.checked?p():(i.value=!1,c.value=!1,e.value=[])},selectAll:p,allCheckedAlertVisible:k(()=>i.value&&!c.value&&e.value.length<t.value),selectRealAll:()=>{c.value=!0},clearSelection:()=>{i.value=!1,c.value=!1,e.value=[],a.value=null,l.value=!1,n.value=[]},selectedIds:e,total:t,checked:k(()=>e.value.length>0),shouldSelect:l,shiftEffectingIds:n,toggleSelect:(s,u,o)=>{s.shiftKey?h(u,o):d(!e.value.includes(u.id),u,o)},handleItemClick(s,u,o,g=()=>{}){if(s.target.nodeName==="MD-CHECKBOX")return;const m=window.getSelection();if(!(m&&m.toString())){if(e.value.length===0){g(o);return}s.shiftKey?h(u,o):d(!e.value.includes(u.id),u,o)}},handleMouseOver(s,u){s.shiftKey?a.value!==null&&a.value!==u&&(n.value=f(u)):n.value=[]}}},B=(r,i)=>{const{t:c}=K();return{deleteItems:(t,e,a,n)=>{let l=n;if(!e){if(t.length===0){C(c("select_first"),"error");return}l=`ids:${t.join(",")}`}N(S,{gql:r,count:e?a:t.length,variables:()=>({query:l}),done:i})}}};function E(){const r=document.activeElement;return r&&(r.tagName==="INPUT"||r.tagName==="TEXTAREA"||r.tagName==="SELECT"||r.tagName==="MD-OUTLINED-TEXT-FIELD")}const P=(r,i,c,t,e,a,n)=>({keyDown:l=>{var h,d;if(document.querySelector("md-dialog[open]")||document.getElementsByClassName("lightbox").length>0)return;const v=(h=document.getElementsByClassName("scroll-content"))==null?void 0:h[0];l.shiftKey?v==null||v.style.setProperty("user-select","none"):v==null||v.style.removeProperty("user-select");const f=(d=document.getElementsByClassName("scroller"))==null?void 0:d[0];if(l.shiftKey?f==null||f.style.setProperty("user-select","none"):f==null||f.style.removeProperty("user-select"),(l.ctrlKey||l.metaKey)&&l.key==="a"&&!E()){l.preventDefault(),t();return}if(l.key==="Escape")e();else if(l.key==="ArrowLeft")c.value>1&&a(c.value-1);else if(l.key==="ArrowRight"){const p=Math.ceil(r.value/i);c.value<p&&a(c.value+1)}else(l.key==="Delete"||(l.ctrlKey||l.metaKey)&&l.key==="Backspace")&&n()},keyUp:()=>{var v;const l=(v=document.getElementsByClassName("scroll-content"))==null?void 0:v[0];l==null||l.style.removeProperty("user-select")}}),A=(r,i,c)=>({keyDown:t=>{var n,l;if(document.querySelector("md-dialog[open]"))return;const e=(n=document.getElementsByClassName("scroll-content"))==null?void 0:n[0];t.shiftKey?e==null||e.style.setProperty("user-select","none"):e==null||e.style.removeProperty("user-select");const a=(l=document.getElementsByClassName("scroller"))==null?void 0:l[0];if(t.shiftKey?a==null||a.style.setProperty("user-select","none"):a==null||a.style.removeProperty("user-select"),(t.ctrlKey||t.metaKey)&&t.key==="a"&&!E()){t.preventDefault(),r();return}t.key==="Escape"?i():(t.key==="Delete"||(t.ctrlKey||t.metaKey)&&t.key==="Backspace")&&c()},keyUp:()=>{var e;const t=(e=document.getElementsByClassName("scroll-content"))==null?void 0:e[0];t==null||t.style.removeProperty("user-select")}});export{P as a,B as b,A as c,D as u};
